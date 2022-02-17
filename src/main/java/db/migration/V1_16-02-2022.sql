
/* A classe/tabela usuarios_acesso criou uma constraint UNIQUE que não deveria (mesmo estando FALSE no Spring). O script abaixo é para deletar esta constraint. */
SELECT constraint_name from information_schema.constraint_column_usage 
where table_name = 'usuarios_acesso' and column_name = 'acesso_id'
and constraint_name <> 'unique_acesso_user';

alter table usuarios_acesso drop CONSTRAINT "uk_8bak9jswon2id2jbunuqlfl9e";