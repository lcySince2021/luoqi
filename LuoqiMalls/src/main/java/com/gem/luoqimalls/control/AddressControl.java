package com.gem.luoqimalls.control;

import com.gem.luoqimalls.pojo.Address;
import com.gem.luoqimalls.pojo.User;
import com.gem.luoqimalls.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("address")
@Controller
public class AddressControl {
    @Autowired
   private AddressService addressService;
    @RequestMapping("addre")
    public String addre(){
        return "/person/address";
    }
    @RequestMapping("addre1")
    public String addre1(){
        return "/person/updateAddress";
    }
    @RequestMapping("address")
    public String address(String userAccount, Model model)
    {
        Integer userId=addressService.getUserIdByUserAccount(userAccount);
        List<Address> addressList=addressService.getAllAddressByUserId(userId);
        Address address=addressService.getAddressByUserId(userId);
        model.addAttribute("userId",userId);
        model.addAttribute("address",address);
        model.addAttribute("addressList",addressList);
        return "/person/address";
    }
    @RequestMapping("addressUpdate")
    public String addressUpdate(String userAccount, Model model,String addressId) {
        Integer id=Integer.parseInt(addressId);
        boolean b = addressService.getIsDefaultToOne();
        boolean c = false;
        if (b) {
            c = addressService.getIsDefaultByAddressId(id);
        }
            Integer userId = addressService.getUserIdByUserAccount(userAccount);
            List<Address> addressList = addressService.getAllAddressByUserId(userId);
            Address address = addressService.getAddressByUserId(userId);
            model.addAttribute("address", address);
            model.addAttribute("addressList", addressList);
            model.addAttribute("userId",userId);
            return "forward:/address/addre";
        }
    @RequestMapping("addAddress")
    public String addAddress(Address address,Model model,String userAccount){
        Integer userId = addressService.getUserIdByUserAccount(userAccount);
        String addressrName=address.getAddressrName();
        String addressTel=address.getAddressTel();
        String addressProvince=address.getAddressProvince();
        String addressCity=address.getAddressCity();
        String addressDistrict=address.getAddressDistrict();
        String addressDetailed=address.getAddressDetailed();
        int isDefault=1;
        Address address2=new Address(addressrName,addressTel,addressProvince,addressCity,addressDistrict,addressDetailed,userId,isDefault);
        boolean b=addressService.addAddressByUserId(address2);
       if(b) {
            List<Address> addressList = addressService.getAllAddressByUserId(userId);
            Address address1 = addressService.getAddressByUserId(userId);
            model.addAttribute("userId",userId);
            model.addAttribute("address", address1);
            model.addAttribute("addressList", addressList);
           return "forward:/address/addre";
        }else {
           List<Address> addressList = addressService.getAllAddressByUserId(userId);
           Address address1 = addressService.getAddressByUserId(userId);
           model.addAttribute("userId",userId);
           model.addAttribute("address", address1);
           model.addAttribute("addressList", addressList);
           model.addAttribute("error",1);
           return "forward:/address/addre";
       }
    }
    @RequestMapping("deleteAddress")
    public String delete(Integer addressId,Integer userId,Model model){
        boolean b=addressService.delAdderssByAddressId(addressId);
        List<Address> addressList = addressService.getAllAddressByUserId(userId);
        Address address1 = addressService.getAddressByUserId(userId);
        model.addAttribute("userId", userId);
        model.addAttribute("address", address1);
        model.addAttribute("addressList", addressList);
        return "/person/address";

    }

    @RequestMapping("updateAddress")
    public String updateAddress(Integer addressId,Model model){
        Address address=addressService.getAllByUserId(addressId);
        model.addAttribute("address",address);
        return "/person/updateAddress";
    }
    @RequestMapping("AddressUpdateList")
    public String AddressUpdateList(Address address,Model model) {
        String addressrName = address.getAddressrName();
        String addressTel = address.getAddressTel();
        String addressProvince = address.getAddressProvince();
        String addressCity = address.getAddressCity();
        String addressDistrict = address.getAddressDistrict();
        String addressDetailed = address.getAddressDetailed();
        Integer userId = address.getUserId();
        Integer addressId = address.getAddressId();
        Address address2 = new Address(addressId, addressrName, addressTel, addressProvince, addressCity, addressDistrict, addressDetailed);
        boolean b = addressService.updateAdderssByAddressId(address2);
        if (b) {
            List<Address> addressList = addressService.getAllAddressByUserId(userId);
            Address address1 = addressService.getAddressByUserId(userId);
            model.addAttribute("userId", userId);
            model.addAttribute("address", address1);
            model.addAttribute("addressList", addressList);
            return "forward:/address/addre";
        } else {
            List<Address> addressList = addressService.getAllAddressByUserId(userId);
            Address address1 = addressService.getAddressByUserId(userId);
            model.addAttribute("userId", userId);
            model.addAttribute("address", address1);
            model.addAttribute("addressList", addressList);
            model.addAttribute("error", 1);
            return "forward:/address/addre1";
        }
    }





    @ResponseBody
    @RequestMapping("addressUpdateajax")
    public  Map<String,Integer>  addressUpdateajax(HttpSession session,int userAccount, Model model,int addressId) {
        Map<String, Integer> maps=new HashMap<String, Integer>();
        User user= (User) session.getAttribute("user");
        int userId=user.getUserId();
        maps.put("insertcart", 1);
        System.out.println(addressId);
         int moren=addressService.mraddressid(userId);
        System.out.println(moren);
         addressService.updatemraddressid(moren);
addressService.updateaddressidtomr(addressId);
        System.out.println(1996);
        return maps;
    }









    }

