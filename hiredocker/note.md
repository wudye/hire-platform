# nacos:
## port must have  - "8848:8848"  
      - "9848:9848"  
      - "8080:8080"  
### 8080 for web visit

## in vm and host machine vist http://<host-ip>:8080/
## must have these three keys
###  NACOS_AUTH_TOKEN=${your_nacos_auth_secret_token} 
### NACOS_AUTH_IDENTITY_KEY={your_nacos_server_identity_key} 
###  NACOS_AUTH_IDENTITY_VALUE=${your_nacos_server_identity_value}