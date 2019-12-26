import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class Buckets {
    public static void createBucket() {
        AmazonS3ClientBuilder.defaultClient().createBucket("examplebucket");
    }
}