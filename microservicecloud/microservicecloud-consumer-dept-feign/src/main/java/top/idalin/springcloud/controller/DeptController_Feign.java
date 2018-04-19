package top.idalin.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import top.idalin.springcloud.entities.Dept;
import top.idalin.springcloud.service.DeptClientService;

@RestController
public class DeptController_Feign
{
    // private static final String REST_URL_PREFIX = "http://localhost:8001";
	private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private DeptClientService service = null;
    
    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
     return this.service.get(id);
    }
   
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
     return this.service.list();
    }
   
    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept)
    {
     return this.service.add(dept);
    }
}

