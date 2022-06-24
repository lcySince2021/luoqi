package com.gem.luoqimalls.service;

import com.gem.luoqimalls.pojo.Address;

import java.util.List;

public interface AddressService {

    Integer getUserIdByUserAccount(String userAccount);
    List<Address> getAllAddressByUserId(Integer userId);
    Address getAddressByUserId(Integer userId);
    boolean getIsDefaultToOne();
    boolean getIsDefaultByAddressId(Integer addressId);
    boolean addAddressByUserId(Address address);
    Address getAllByUserId(Integer userId);
    boolean updateAdderssByAddressId(Address address);
    boolean delAdderssByAddressId(Integer addressId);

    int mraddressid(int userid);
   void updatemraddressid(int addressid);
    void updateaddressidtomr(int addressid);
}
