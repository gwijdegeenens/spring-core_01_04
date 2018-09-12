package eu.noelvaes.housekeeping.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.*;

public class CleaningServiceImpl implements CleaningService {


    private CleaningTool tool;

    public CleaningServiceImpl() {
        System.out.println("CleaningServiceImpl: constructor");
    }

    public void setCleaningTool(CleaningTool tool) {
        this.tool = tool;
    }

    public void init() {
        System.out.println("CleaningService preparing for work.");
    }

    public void destroy() {
        System.out.println("CleaningService cleaning up.");
    }

    public void clean() {
        System.out.println("Cleaning the house");
        tool.doCleanJob();
    }
}
