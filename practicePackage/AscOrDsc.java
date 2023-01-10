package practicePackage;

public class AscOrDsc {
    static Pair maxNtype(long arr[], long n)
    {
        long ascRotSeq=0;
        long dscRotSeq=0;
        int type=0;
        long max=0;
        for(int i=0;i<n;i++){
            max=Math.max(arr[i],max);
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                ascRotSeq++;
            }
            else if(arr[i]>arr[i+1]){
                dscRotSeq++;
            }
        }
        if(ascRotSeq==n-1){
            type=1;
        }
        else if(dscRotSeq==n-1){
            type=2;
        }
        else if(dscRotSeq>ascRotSeq){
            type=3;
        }
        else if(dscRotSeq<ascRotSeq){
            type=4;
        }

        return new Pair(type,max);
    }


    public static void main(String[] args) {
        long[] arr ={2,1,5,4,3};
        Pair p = maxNtype(arr,5);
        System.out.println(p.getMax()+" "+ p.getSeq());
    }
}


//static pair maxNtype(long arr[], long n)
//    {
//
//        int maxElement=0;
//        int type=0;
//        boolean desRot=false;
//         boolean ascRot=false;
//        pair p = null;
//        if(arr[1]<arr[0] && arr[1]<arr[2]){
//            return new pair(4,arr[0]);
//        }
//        if(arr[arr.length-2]<arr[arr.length-3] && arr[arr.length-2]<arr[arr.length-1]){
//            return new pair(3,arr[arr.length-1]);
//        }
//        if(arr[1]<arr[0]){
//            for(int i=1;i<n-1;i++){
//                if(arr[i]>arr[i-1] ){
//                  p = new pair(3,arr[i]);
//                  desRot=true;
//                  break;
//                }
//            }
//            if(!desRot){
//                p= new pair(2,arr[0]);
//            }
//        }
//                if(arr[1]>arr[0]){
//                    for(int i=1;i<n;i++){
//                        if(arr[i]<arr[i-1]){
//                            p=new pair(4,arr[i-1]);
//                            ascRot=true;
//                            break;
//                        }
//                    }
//                     if(!ascRot){
//                p=new pair(1,arr[arr.length-1]);
//            }
//                }
//
//
//
//        return p;
//    }


