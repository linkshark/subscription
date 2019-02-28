package com.linkjb.media.subscription;

import com.linkjb.media.subscription.jpa.User;
import com.linkjb.media.subscription.jpa.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubscriptionApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void userAdd() {
        User user = new User();
//        user.setUserId("11");
        user.setPhoneNumber("123");
        user.setUserName("123");
        userRepository.save(user);
    }

    @Test
    public void Test1(){
        String a = "sbabcdfdbsdfkjgnabcdefg";
        String b = "sabfdgabcdabcdefg";
        int count = 0;
        String tempString = "";
        for(int i=0;i<a.length();i++){
            for(int j=i;j<a.length();j++){
                String tempa = a.substring(i,j);
                for(int k = 0 ;k<b.length();k++){
                    for(int l=k;l<b.length();l++){
                        String tempb= b.substring(k,l);
                        if(tempa.equals(tempb)){
                            int tempcount = tempa.length();
                            if(tempcount>count){
                                count = tempcount;
                                tempString=tempa;

                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(tempString);

    }

    @Test
    public void Test2(){
        String[] stringArray = new String[3];
        stringArray[0] = "one";
        stringArray[1] = "two";
        stringArray[2] = "three";

        List<String> stringList = Arrays.asList(stringArray);

        stringList.set(0,"oneList");
        System.out.println(stringArray[0]);
    }

}
