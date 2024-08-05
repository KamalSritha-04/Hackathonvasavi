class Stringclassmethods {
    public static void main(String args[]){
        String s1="String";
        String s2="Hello";
        String s3="Manipulation";
        String s4="   Hello World";
        System.out.println(s1.indexOf("i"));
        System.out.println(s1.lastIndexOf());
        System.out.println(s1.toCharArray());
        System.out.println(s2.charAt(2));
        System.out.println(s1.concat(s3));
        System.out.println(s2.replace('l','c'));
        System.out.println(s3.substring(3,11));
        System.out.println(s1.contains("tri"));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.concat(s3));
        System.out.println(s4.trim());
        System.out.println(s4.startsWith("Hello"));
        System.out.println(s2.endsWith("lo"));
        System.out.println(s3.toUpperCase());
        System.out.println(s4.toLowerCase());
    }
}
