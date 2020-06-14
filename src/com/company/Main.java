package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        while (true){
            Scene scene=new Scene();
            int selction1=scene.start();
            if (selction1==1){
                int x = scene.after();
                if (x == -1) {
                    System.out.println("等你重临峡谷！");
                    break;
                }
                int y = scene.then();
                while (true) {
                    if (y == -1) {
                        break;
                    } else if (y == 0) {
                        x = scene.after();
                    } else {
                        scene.selection(x, y);
                    }
                    y=scene.then();
                }
                System.out.println("等你重临峡谷！");
                break;
            }
            else {
                System.out.println("等你重临峡谷！");
                break;
            }
        }
    }
}
