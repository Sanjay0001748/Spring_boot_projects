package com.rest.demo.control;

import com.rest.demo.model.cloudvendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class cloudcontrol {

    cloudvendor vendor;
    @GetMapping("{id}")
    public cloudvendor vendorid(String id)
    {
        return  vendor;
    }
    @PostMapping
    public String createdetails(@RequestBody cloudvendor vendor)
    {
        this.vendor=vendor;
        return "cloud vendor details successfully created";
    }
    @PutMapping
    public String updatedetails(@RequestBody cloudvendor vendor)
    {
        this.vendor=vendor;
        return "cloud vendor details updated successfully ";
    }
    @DeleteMapping("{vendorid}")
    public String Deletedetails(String vendorid)
    {
        this.vendor=null;
        return "cloud vendor details deleted successfully ";
    }


}
