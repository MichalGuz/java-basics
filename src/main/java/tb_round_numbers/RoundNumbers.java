package tb_round_numbers;

public class RoundNumbers {
    public static int getBucketCount(double width, double hight, double areaPerBucket, int extraBuckets) {
        int result = 0;
        if((width <= 0) || (hight <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            result = -1;
        } else {
            double bucket = Math.ceil((width * hight) / areaPerBucket);
            result = (int) (bucket - extraBuckets);
        }
        return result;
    }

    // #1 overloaded getBucketCount()
    public static int getBucketCount(double width, double hight, double areaPerBucket) {
        int result = 0;
        if((width <= 0) || (hight <= 0) || (areaPerBucket <= 0)) {
            result = -1;
        } else {
            double bucket = Math.ceil((width * hight) / areaPerBucket);
            result = (int)bucket;
        }
        return result;
    }

    // #2 overloaded getBucketCount()
    public static int getBucketCount(double area, double areaPerBucket){
        int result = 0;
        return result;
    }
