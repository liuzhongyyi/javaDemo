package com.lzy.demo16;


public class decSize {
    public static void main(String[] args) {
        StringBuilder builder = decWords("aabcccccaaasssssssssdgdhfj");
        System.out.println(builder);

    }

    static StringBuilder decWords(String s) {
//        int count = 0 ;
//        int len =s.length();
//        for(int i = 0 ; i<len-1; i++)
//        {
//            if(s.charAt(i+1)==s.charAt(i))
//            {
//                count++;
//            }else {
//              s.replace(s.substring(i-1-1,i-count-1),"");
//                char s1= String.valueOf(count).charAt(0);
//                s.replace(s.charAt(i),s1);
//                count=0;
//                len=len-count;
//
//            }
//        }
//        return s;
//    }

//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        char[] chars = s.toCharArray();
//        for (char aChar : chars) {
//            if(hashMap.containsKey(aChar))
//            {
//                Integer num = hashMap.get(aChar);
//                hashMap.put(aChar,++num);
//            }else {
//                hashMap.put(aChar,1);
//            }
//        }
//        StringBuilder builder = new StringBuilder();
//        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
//            if(entry.getValue()==1)
//            {
//                builder.append(entry.getKey());
//            }else {
//                builder.append(entry.getKey()+String.valueOf(entry.getValue()));
//            }
//        }
//        return  builder;
//    }
        char[] chars = s.toCharArray();
        char c = chars[0];
        int count = 1;
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            } else {
                builder = builder.append(c);
                builder.append(count);
                c = chars[i];
                count = 1;
            }
        }
        builder = builder.append(c);
        builder.append(count);
        return builder;

    }
}