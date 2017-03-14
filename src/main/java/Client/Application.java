/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Commands.CLI;
import world.drj.drjclass.client.jedis.JedisClient;

/**
 *
 * @author Shelly.Baltazar
 */
public class Application {

    public static void main(String[] args) {
        CLI cli = new CLI();
        
        System.out.println("Welcome to the Chat Client!");
        System.out.println("Chat with others and have great time!");
        System.out.println("If you need help, type in '!h' or '!help'");
        System.out.println("Type below to begin: ");
        
        JedisClient jc = new JedisClient(cygnusx1.apa.rocks, "msg");
        
        String result;
        while(true){ //while it hasn't exited
        result = cli.scanString(cli.nextString());
        System.out.println("Echo>  " + result);
        
        }
    }
}
