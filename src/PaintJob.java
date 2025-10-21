public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
    }
    public static int getBucketCount(double width, double height,double areaPerBucket, int extraBuckets) {
        if ( width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets<0) {
            return -1;
        }
        double area = width * height;
        double coverArea = areaPerBucket * extraBuckets;
        double areaLeft = area - coverArea;
        if (areaLeft <= 0) return 0;
        double round_rest = Math.ceil(areaLeft / areaPerBucket);
        return (int) round_rest;
        
    }
    public static int getBucketCount(double width, double height,double areaPerBucket){
         if ( width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
       
        return (int) Math.ceil(area /areaPerBucket);
        
    }
    
    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) Math.ceil(area/ areaPerBucket);
    }
}