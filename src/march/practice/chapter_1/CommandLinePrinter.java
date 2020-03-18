package march.practice.chapter_1;

class CommandLinePrinter {

    void printCommandLine(String[] args){
        for (int i = args.length-1; i >=0 ; i--) {
            System.out.println(args[i]);
        }
    }
}
