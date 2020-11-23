package com.example.apiConnection.controller;

import com.example.apiConnection.City;
import com.example.apiConnection.controller.model.dto.SehirDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping ("/ozgurproject")
public class CityController {


    City city = new City();

    SehirDTO sehirDTO = new SehirDTO();


    @RequestMapping(value = "/api", method = RequestMethod.GET)
    @ResponseBody
    public String getCity() {

        return "Kars";
    }



    @PostMapping("/api")
    @ResponseBody
    public ArrayList <SehirDTO> addCity(@RequestBody ArrayList<SehirDTO> sehirList) {

        boolean flag = false;
        for (SehirDTO dto : sehirList) {
            if (dto.getSehirAdi().contains("kars")) {
                System.out.println("iceriyor");
                flag= true;
                break;
            }
        }
        if (!flag) System.out.println("icermiyor");


        /*  ALTERNATIF
        for(int i = 0; i<sehirList.size(); i++) {
            SehirDTO dto = sehirList.get(i);

        }
        if (!flag) System.out.println("icermiyor");
        if (sehirList.contains("kars")) {
            System.out.println("içeriyor");
        } else {
            System.out.println("içermiyor");
        }
            */

        return sehirList;
    }
}
