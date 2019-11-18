package com.hlp.mapper;

import com.hlp.model.SyMenus;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import sun.awt.Symbol;

import java.security.PublicKey;
import java.util.List;
@Service
public interface SyMenusMapper {


/*菜单xxx栏*/
    @Select("select * from SY_MENUS a inner join sy_rolesmenus b on a.id=b.menuid where b.roleid=#{id} and parentid='-1'")
    public List<SyMenus> FillAllSyMenusByid(int id);

    @Select("select * from SY_MENUS a inner join sy_rolesmenus b on a.id=b.menuid where b.roleid=#{id} and parentid=#{sid}")
    public List<SyMenus> FillAllSyZJMenusByid(int id,int sid);

/*主*/
    @Select("select b.* from (select t.*,rownum rn from sy_menus t where t.text like '%'||#{colName}||'%')b where  b.rn> (#{pag}-1)*#{size} and b.rn <=#{pag}*#{size}")
    @Results({
            @Result(property = "id",column = "id",id=true),
            @Result(property = "syRoles",column = "id",many=@Many(select="com.hlp.mapper.SyRoleMapper.OneSyRoleByid"))
    })
    public List<SyMenus> FillAllSyMenusPage(String colName,int pag,int size);
/*最大数值*/
    @Select("select count(*) from  sy_menus")
    public int MaxSyMenus();
    /*max2 */
    @Select("select count(*) from sy_menus where id=#{id} or parentid=#{pid} ")
    public int  MaxTwoMenusByidLX(int id,String pid);
    /*max3*/
    @Select("select count(*) from sy_menus where text like '%'|| #{name}||'%'")
    public int  MaxMenusLikeNameLX(String name);







/*一级目录查询*/
    @Select("select * from sy_menus where parentid=#{f}")
    public List<SyMenus> FillAllOneColumnSyMenus(String f);
    /*模糊查  测试*/
    @Select("select b.* from (select t.*,rownum rn from sy_menus t)b where  b.text like '%'||#{colName}||'%' and   b.rn> (1-1)*61 and b.rn <=1*61")
    public List<SyMenus> FillAllLikeTextSyMenus(String colName);

/*下拉*/
    @Select("select b.* from (select t.*,rownum rn from sy_menus t  where   parentid=#{pid} or id=#{id})b where b.rn> (#{pag}-1)*#{size} and b.rn <=#{pag}*#{size}")
    public List<SyMenus>  FillSyMenusByidLX(int id,String pid,int pag,int size);

    /*测试*/
    @Select("select * from sy_menus where parentid=#{id}")
    public List<SyMenus>  FillSyMenusByidLXxxxxx(String id);
/*新增*/
    @Insert("insert into sy_menus values(sy_menus_id.nextval,#{parentid},#{type},#{text},#{url},#{tip})")
    public int insertSyMenusLX(SyMenus syMenus);
/*删除*/
    @Delete("delete from sy_menus  where id=#{id}")
    public int deleteSyMenusByidLx(int id);
/*修改*/
    @Update("update sy_menus set parentid=#{parentid},type=#{type},text=#{text},url=#{url},tip=#{tip} where id=#{id}")
    public int updateSyMenusLx(SyMenus syMenus);
    /*id查询*/
    @Select("select * from sy_menus  where id=#{id}")
    public SyMenus FillSyMenusByIdLx(int id);

}