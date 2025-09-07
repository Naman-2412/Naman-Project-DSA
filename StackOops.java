package TryBufferLibra;

import java.io.*;
import java.util.*;

public class StackOops {

        public static class CustomStack {
            int[] data ;
            int tos;

            public CustomStack(int cap) { // parametrized constructor 
                data = new int[cap];
                tos =-1;
            }

            int size() {
                return tos + 1;// write your code here
            }

            void display() {
                for (int i=tos; i>=0;i++){
                    System.out.print(data[tos] + " " );}
                    System.out.println(); 
                    
                }//write your code here
            }

            void push() {
                if(tos==data.length - 1) 
                {
                    System.out.println("stack overflow");
                } 
                else {
                tos++;
                data[tos] = val;

            }}

            int top() {
                if(tos == -1){
                     System.out.print("stack underflow");
                     return -1;
                }else{
                    return data[tos];
                }

            }

            int pop(){
                 if(tos == -1){
                     System.out.print("stack underflow");
                     return -1;
                }else{
                    int val = data[tos];
                    tos--;
                    return val;
                }

            }
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt (br.readLine());
            CustomStack st= new CustomStack(n);

            String str = br.readLine();
            while(str.equals("quit")==false){
                if(str.startsWith("push")){
                    int val = Integer.parseInt(str.split(" ")[1]);
                    st.push(val);
                }else if(str.startsWith("pop")){
                    int val=st.pop();
                    if(val != -1){
                        System.out.println(val);
                    }
                }else if(str.startsWith("size")){
                    System.out.println(str);
                    int val = st.top();
                    if(val != -1){
                        System.out.println(val);
                    }
                    else if(str.startsWith("size"))
                    System.out.println(st.size());
                } else if(str.startsWith("display")){
                    st.display();
                }
            }
        }
}
