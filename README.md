# Getting Started

## Steps to deploy Spring boot as a Lambda

First create sam yml

1. Upload to S3 - aws --region ap-south-1 cloudformation package --template-file sam.yaml --output-template-file output-sam.yaml --s3-bucket test-live-projects
2. Run Cloudformation to deploy App - aws --region ap-south-1 cloudformation deploy --template-file output-sam.yaml --stack-name springbootapp --capabilities CAPABILITY_IAM
3. If stack is there then delete the stack - aws cloudformation --region ap-south-1 delete-stack --stack-name springbootapp
4. If stack deployment is failed then check the events - aws cloudformation  --region ap-south-1 describe-stack-events --stack-name springbootapp
5. View Stack Just Created - aws --region us-west-1 cloudformation describe-stacks --stack-name springbootapp 
6-echeckinfo s3 bucket detail-aws s3 ls
