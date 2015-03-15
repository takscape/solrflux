Solr Flux is an interactive command-line interface for Solr. It allows you to insert/delete/query documents with SQL-like syntax.

Solr Fluxは、Solrのための対話的なコマンドラインインターフェースです。
SQLに似た構文で、文書の挿入/削除/検索を行うことができます。

Example
```
USE "http://127.0.0.1:8983/solr" AS conn;

INSERT INTO conn (id, text, size) VALUES ("foo", "bar", 100);
COMMIT conn;

SELECT * FROM conn WHERE id="foo";

DELETE FROM conn WHERE size<1000;
COMMIT conn;
```