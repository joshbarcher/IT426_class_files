package edu.greenriver.it.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/baking")
public class BakingTipsController
{
    private String[] bakingTips = {
        "Always Have the Correct Butter Consistency.",
        "Room Temperature is KEY.",
        "Read the Recipe Before Beginning.",
        "Always Have Ingredients Prepped.",
        "Learn How to Measure.",
        "Weigh Your Ingredients.",
        "Get an Oven Thermometer.",
        "Keep Your Oven Door Closed."
    };

    @RequestMapping("/random")
    @ResponseBody
    public String randomTip() {
        return "";
    }

    @RequestMapping("/")
    @ResponseBody
    public String tips() {
        return "";
    }

    @RequestMapping("/num_tips")
    @ResponseBody
    public String numTips() {
        return "";
    }

    @RequestMapping("/{tipId}")
    @ResponseBody
    public String tipById(@PathVariable int tipId) {
        return "";
    }
}
