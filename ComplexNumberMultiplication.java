class Solution {
    public String complexNumberMultiply(String a, String b) {
        //System.out.println(a);
        String[] arr = a.split("\\+");
        int real1= Integer.parseInt(arr[0]);
        StringBuffer sb = new StringBuffer(arr[1]);
        sb.deleteCharAt(arr[1].length()-1);
        arr[1]=sb.toString();
        int comp1 = Integer.parseInt(arr[1]);
        
        arr = b.split("\\+");
        int real2= Integer.parseInt(arr[0]);
        StringBuffer sb1 = new StringBuffer(arr[1]);
        sb1.deleteCharAt(arr[1].length()-1);
        arr[1]=sb1.toString();
        int comp2 = Integer.parseInt(arr[1]);
        
        int real= real1*real2;
        int comp=comp1*comp2*-1;
        int mid =real1*comp2+real2*comp1;
        
        String complex = Integer.toString(mid)+ "i";
        
        String res= Integer.toString(real+comp)+"+"+complex;
        
        return res;
    }
}