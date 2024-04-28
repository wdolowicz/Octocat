This repository contains couple Rest Assured tests playground for Github API.


Used libraries & versions:

*rest-assured 5.4.0
*junit 4.13.2
*json 20200518
*junit-jupiter-api 5.11.0-M1
*jackson-databind 2.17.0

Since Github doesn't allow for login & password authorization, a bearer token is used. For compatibility it isn't
obfuscated or made secret but it might be expired at the time of repository being cloned, thus a new one has to be generated and provided in config.properties.
