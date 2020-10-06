package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {
    @Test
    public void givenPassword_whenMatches_ShouldReturn() {
        UserRegistration userRegistration = new UserRegistration();
        String  password1 = userRegistration.password("Akhilkumar@");
        String  password2 = userRegistration.password("Akhil");
        String regex = "^(?=^.).{8,}$";
        Pattern p =Pattern.compile(regex);
        Assert.assertEquals(true , password1.matches( p.pattern() ));
        Assert.assertEquals(false,password2.matches( p.pattern() ));

    }
}
