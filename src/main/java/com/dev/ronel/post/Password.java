package com.dev.ronel.post;

import org.springframework.util.Assert;

import java.time.LocalDateTime;

public abstract class Password {

    abstract String asString();


    public static class EncryptedPassword extends Password{

        private final String value;

        private final LocalDateTime expire;

        public EncryptedPassword(String value, LocalDateTime expire) {
            this.value = value;
            this.expire = expire;
        }

        static EncryptedPassword of(String value){

            Assert.hasText(value,"most not be null");
            return new EncryptedPassword(value,null);
        }

        static EncryptedPassword of(String value, LocalDateTime expire){
            Assert.hasText(value,"most not be null");
            Assert.notNull(expire,"most not be null");

            return new EncryptedPassword(value,expire);
        }

        public boolean isExpired(){
            return expire !=null && expire.isBefore(LocalDateTime.now());
        }

        @Override
        String asString() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
