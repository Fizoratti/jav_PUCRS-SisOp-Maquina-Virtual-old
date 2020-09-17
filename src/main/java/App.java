/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import os.OperatingSystem;
import programs.Programs;
import vm.Program;
import vm.VirtualMachine;
import vm.CPU;
import vm.Tag;

public class App {
    public static void main(String[] args) {    log.info(Tag.green("It works!")+"\n");

        Program[] programs = {
            Programs.p0,
            Programs.p1,
            Programs.p2,
            Programs.p3,
            Programs.p4,
        };
        
        VirtualMachine.createVM();
        VirtualMachine vm = VirtualMachine.get();;                       log.info("{} {} "+Tag.green("VM is set!")+"\n", Tag.VM, Tag.SETUP);

        OperatingSystem.createOS();
        OperatingSystem os = OperatingSystem.get();

        try {
            os.start();
            os.stop();
        } catch (Exception e) {
            log.info("Uncaught error!");
        }


        vm.init(os);
        vm.os.load(programs);

        vm.init(programs);                     
        vm.stop();

    }

    /* END */

    private static Logger log = LoggerFactory.getLogger("");

}
