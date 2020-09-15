/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import programs.Programs;
import vm.Program;
import vm.VM;
import vm.CPU;
import vm.Tag;

public class App {
    public static void main(String[] args) {    log.info(Tag.green("It works!")+"\n");

        Program[] programas = {
            Programs.p0,
            Programs.p1,
            Programs.p2,
            Programs.p3,
            Programs.p4,
        };
        
        VM vm = new VM();                       log.info("{} {} "+Tag.green("VM is set!")+"\n", Tag.VM, Tag.SETUP);

        vm.init(programas);                     
        vm.stop();

    }

    /* END */

    private static Logger log = LoggerFactory.getLogger(CPU.class);

}
