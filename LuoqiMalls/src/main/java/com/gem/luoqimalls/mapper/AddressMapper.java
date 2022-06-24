package com.gem.luoqimalls.mapper;

import com.gem.luoqimalls.pojo.Address;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AddressMapper {
    @Select("select userId from `user` where userAccount=#{param1}")
     Integer selectUserIdByUserAccount(String userAccount);
    @Select("select * from address where userId=#{param1} and isDefault=1")
    List<Address> selectAllAddressByUserId(Integer userId);
    @Select("select * from address where userId=#{param1} and isDefault=0")
    Address selectAddressByUserId(Integer userId);
    @Update("update address set isDefault=1 ")
    boolean updateIsDefaultToOne();
    @Update("update address set isDefault=0 where addressId=#{param1} ")
    boolean updateIsDefaultByAddressId(Integer addressId);
    boolean insertIntoAddress(Address address);
    Address selectAllByUserId(Integer addressId);
    boolean updateAddressByAddressId(Address address);
    boolean deleteAddressByAddressId(Integer addressId);

//   现在用户的默认地址的id

    @Select("  select  addressid from  address  where isDefault=0  and userid=#{param1}")
 int mraddressid(int userid);
//            改变当前默认地址

    @Select("  update  address set isDefault=1 where addressid=#{param1}")
   void updatemraddressid(int addressid);
//            将所选地址改为默认地址

    @Select("  update  address set isDefault=0 where addressid=#{param1}")
   void updateaddressidtomr(int addressid);





}
