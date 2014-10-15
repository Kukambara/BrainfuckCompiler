package ua.nure.arseniuk.dmytro;

/**
 * Hello world!
 */
public class Application {
    public static void main(String[] args) {
        /**
         * [Outputs square numbers from 0 to 10000.
         * Daniel B Cristofani (cristofdathevanetdotcom)
         * http://www.hevanet.com/cristofd/brainfuck/]
         */
        String input = "++++[>+++++<-]>[<+++++>-]+<+[\n" +
                "    >[>+>+<<-]++>>[<<+>>-]>>>[-]++>[-]+\n" +
                "    >>>+[[-]++++++>>>]<<<[[<++++++++<++>>-]+<.<[>----<-]<]\n" +
                "    <<[>>>>>[>>>[-]+++++++++<[>-<-]+++++++++>[-[<->-]+[<<<]]<[>+<-]>]<<-]<<-\n" +
                "]";

        Compiler compiler = new Compiler();
        Executor executor = new Executor();
        executor.execute(compiler.compile(input));
    }
}
