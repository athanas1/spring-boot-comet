package edu.wctc.nwc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/information")
public class InformationController {

    @RequestMapping("/cometfacts")
        public String showCometFacts1 () {
            return "pages/comet-facts";
        }

    @RequestMapping("/morecometfacts")
    public String showCometFacts2 () {
        return "pages/comet-facts-2";
    }

    @RequestMapping("/howtoview")
    public String showHowToView() {
        return "pages/how-to-view";
    }
}
