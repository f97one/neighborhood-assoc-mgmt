package net.formula97.app.gaej.nams.webcontroller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(Model model) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault());
        Calendar cal = Calendar.getInstance();
        String t = String.format(Locale.getDefault(), "Hello, current time is %s !", sdf.format(cal.getTime()));
        
        model.addAttribute("msg", t);
        return "sayhello";
    }
}
