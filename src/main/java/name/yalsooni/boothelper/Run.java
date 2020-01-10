package name.yalsooni.boothelper;


import name.yalsooni.boothelper.execute.BootHelper;

/**
 * Created by ijyoon on 2016. 8. 1..
 */
public class Run {

    public static void main(String[] args) throws Exception {
        BootHelper bootHelper = new BootHelper();
        bootHelper.exe(args);
    }
}
