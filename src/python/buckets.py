import boto3

s3 = boto3.client('s3')
response = s3.create_bucket(Bucket='examplebucket',CreateBucketConfiguration={
        'LocationConstraint': 'eu-north-1'})
print(response)
