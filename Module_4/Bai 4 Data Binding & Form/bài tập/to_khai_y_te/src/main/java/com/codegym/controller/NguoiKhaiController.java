package com.codegym.controller;

import com.codegym.model.NguoiKhai;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;

@Controller
public class NguoiKhaiController {
    @GetMapping("")
    public String showForm(Model model){
        String[] gioiTinh = new String[]{"Nam","Nữ"};
        String[] quocGia = new String[]{"Viet Nam","Thái","Trung Quốc","Lào","Campuchia"};
        String[] phuonTien = new String[]{"máy bay","tàu thuyền","oto","xe máy","khác"};
        String[] thanhPho = new String[]{"Hồ Chí Minh","Đà Nẵng","Huế","Gia Lai","Nha Trang"};
        String[] huyen = new String[]{"Bình thuận","Hải an","phước mỹ","tây hồ","Bình Chánh","An hải bắc"};
        String[] phuong = new String[]{"Hải Châu","Sơn Trà","Thanh Hà","Liên chiểu"};

        model.addAttribute("gioiTinh",gioiTinh);
        model.addAttribute("quocGia",quocGia);
        model.addAttribute("phuongTien",phuonTien);
        model.addAttribute("thanhPho",thanhPho);
        model.addAttribute("huyen",huyen);
        model.addAttribute("phuong",phuong);
        model.addAttribute("nguoiKhai",new NguoiKhai());
        return "form";
    }
}
