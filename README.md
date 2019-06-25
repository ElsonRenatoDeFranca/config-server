# config-server

Why do we use config server?

1- The configuration is under version control. In fact it has be backed by a Git initialized repository in order for it to even run and once 
we have Git involved, we now have version control of every change that needs to be made. Additionally, config server give us a centralized 
management point of all our configuration variables.

2- What is a config server

2.1 - It is  a simple spring boot starter project;
2.2 - It's tied directly to a git repository;
2.3 - Loads config on startup and serves it via REST;
2.4 - Provides support for branches and Spring profiles;
