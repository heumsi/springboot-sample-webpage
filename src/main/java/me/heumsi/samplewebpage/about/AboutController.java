package me.heumsi.samplewebpage.about;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String getAbout() {
        return "page/about";
    }

    @GetMapping("/about-edit")
    public String getAboutEdit(){
        return "page/about_edit";
    }
}
