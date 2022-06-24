package com.gem.luoqimalls.service.impl;

import com.gem.luoqimalls.mapper.AddressMapper;
import com.gem.luoqimalls.pojo.Address;
import com.gem.luoqimalls.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressMapper addressMapper;
    @Override
    public Integer getUserIdByUserAccount(String userAccount) {
        return addressMapper.selectUserIdByUserAccount(userAccount);
    }

    @Override
    public List<Address> getAllAddressByUserId(Integer userId) {
        return addressMapper.selectAllAddressByUserId(userId);
    }

    @Override
    public Address getAddressByUserId(Integer userId) {
        return addressMapper.selectAddressByUserId(userId);
    }

    @Override
    public boolean getIsDefaultToOne() {
        return addressMapper.updateIsDefaultToOne();
    }

    @Override
    public boolean getIsDefaultByAddressId(Integer addressId) {
        return addressMapper.updateIsDefaultByAddressId(addressId);
    }

    @Override
    public boolean addAddressByUserId(Address address) {
        return addressMapper.insertIntoAddress(address);
    }

    @Override
    public Address getAllByUserId(Integer userId) {
        return addressMapper.selectAllByUserId(userId);
    }

    @Override
    public boolean updateAdderssByAddressId(Address address) {
        return addressMapper.updateAddressByAddressId(address);
    }

    @Override
    public boolean delAdderssByAddressId(Integer addressId) {
        return addressMapper.deleteAddressByAddressId(addressId);
    }

    @Override
    public int mraddressid(int userid) {
        return addressMapper.mraddressid(userid);
    }

    @Override
    public void updatemraddressid(int addressid) {
   addressMapper.updatemraddressid(addressid);
    }

    @Override
    public void updateaddressidtomr(int addressid) {
addressMapper.updateaddressidtomr(addressid);
    }
}
