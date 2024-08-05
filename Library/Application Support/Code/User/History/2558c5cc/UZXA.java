class Garbagecollection {
    public static void main(String args[]){
        Garbagecollection g1=new Garbagecollection();
        Garbagecollection g2=new Garbagecollection();
        g1=null;
        System.gc();
        g2=null;
        Runtime.getRuntime().gc();
    }
    protected void finalize() throws Throwable
    {
        
    }
}
