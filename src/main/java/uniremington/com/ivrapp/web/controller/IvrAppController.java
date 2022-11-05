package uniremington.com.ivrapp.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uniremington.com.ivrapp.domain.IvrApp;
import uniremington.com.ivrapp.domain.service.IvrAppService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app")
public class IvrAppController {

    @Autowired
    private IvrAppService appService;


    @GetMapping("/all")
    public List<IvrApp> getAll() {
        return appService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<IvrApp> getByIdApp(@PathVariable("id") int idApp) {
        return appService.getByIdApp(idApp);
    }

    @PostMapping("/save")
    public IvrApp save(@RequestBody IvrApp ivrApp) {
        return appService.save(ivrApp);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int idApp) {
        return appService.delete(idApp);
    }


}
