# Kiraye.az
Tech stack: 
-	Datasource Connection : MyBatis 
-	Logging is required(ELK= ElasticSearch Logstash Kibana).
-	Email system integration
-	Security (Acces token + Refresh token) + Sign in with Google
-	Message Queue(RabbitMQ) for email system
-	Migration(Liquibase)
-	PostgreSql
-	¬Redis for Cache(OTP + Static data)
-	All third party apps should be in Docker Compose


Branch names: 
- Features(feature/TASK-KOD_add_redis)
- Bugfixes(bugfix/TASK-KOD_change_access_key)
