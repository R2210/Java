class SIOR
{
    public static void main(String[] args)
    {
        try{
            String a="i like Cricket";
            char c=a.charAt(24);
            System.out.println(c);
        }
        catch(StringIndexOutOfBounds e)
        {
            System.out.println(e);
        }
    }
}