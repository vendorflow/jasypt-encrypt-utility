# jasypt-encrypt-utility
Command-line utility for encrypting Jasypt values compatible with 
[`jasypt-spring-boot`](https://github.com/ulisesbocchio/jasypt-spring-boot)

To use this utility, set the `JASYPT_ENCRYPTOR_PASSWORD` environment variable and optionally
any other configuration variables. Run it. It will prompt for a single line of input,
encrypt it, and print the result suitable for use in an `ENC()` placeholder.
