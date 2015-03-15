## USE ##
Solrへのコネクションを定義する。
```
USE solr_url [AS name];
```

  * solr\_url: SolrのURL
  * name: コネクションを参照するための名前

AS節は省略可。省略した場合、デフォルトの接続になる。

(例)
```
USE "http://192.168.1.2:8983/solr";
USE "http://localhost:8983/solr" AS conn;
```

## SELECT ##
文書を検索する。
```
SELECT expr1, expr2, ... [FROM connection] [WHERE where_expression | NWHERE native_query] [ORDER BY sortfield1 [ASC|DESC], sortfield2 [ASC|DESC], ...] [LIMIT number [OFFSET offset]];
```
  * expr1, expr2, ... : 検索結果セットに含める式のリスト
  * connection: USEステートメントによって定義されたSolrへのコネクションのID
  * where\_expression: 検索条件
  * native\_query: Solr本来のクエリ言語によって記述された検索条件
  * sortfield1, sortfield2, ... : 検索結果のソートに用いるフィールドのリスト
  * number: 最大何件の検索結果アイテムを返すか
  * offset: ヒットした検索結果セットのうち、何件目からを返すか（0から始まる）

exprに「`*`」を指定すると、全フィールドが返される。

FROM節は省略可。省略した場合は、デフォルトの接続が用いられる。

WHERE節, NWHERE節は、いずれか一方のみ記述できる。native\_queryは、文字列として記述。WHERE, NWHEREの両方を省略した場合、全文書が検索結果として返される。

ORDER BYは省略可。省略した場合は、scoreで降順ソートされる。すなわち、「ORDER BY score DESC」と等価。

LIMIT節は省略可。省略した場合、10件が返される。

OFFSET節は省略可。省略した場合、0が指定されたものとみなされる。

（例）
```
SELECT * FROM conn WHERE id="foo";
SELECT * FROM conn WHERE id!="foo";
SELECT id,text FROM conn WHERE 0<size AND size<100;
SELECT * ORDER BY size DESC LIMIT 100 OFFSET 10;
SELECT * FROM conn NWHERE "id:foo AND size:[* TO 1000]";
SELECT SUBSTRING(text, 0, 3) AS first_three_letters WHERE text="bar";
```

## INSERT ##
文書を登録する。登録した文書は、COMMITステートメントを実行するまで、検索結果に反映されない。
```
INSERT [INTO connection] (field1, field2, ...) [VALUES (expr1, expr2, ...) | select_statement];
```

（例）
```
INSERT INTO conn (id, text, size) VALUES ("foo", ["paragraph1", "paragraph2"], 1024);
INSERT INTO conn (id, text, size) SELECT id, text, size FROM conn2;
```

## DELETE ##
文書を削除する。削除した文書は、COMMITステートメントを実行するまで、検索結果に反映されない。
```
DELETE [FROM connection] [WHERE where_expression];
```

（例）
```
DELETE FROM conn WHERE id="foo";
DELETE;
```

## COMMIT ##
文書の挿入/削除を確定する。
```
COMMIT [connection];
```

## ROLLBACK ##
文書の挿入/削除を取り消す。
```
ROLLBACK [connection];
```

## OPTIMIZE ##
インデックスを最適化する。
```
OPTIMIZE [connection];
```