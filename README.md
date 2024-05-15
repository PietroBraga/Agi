
# Agi Automation

Uma demonstração de automação para o AgiBank




## Features

- Selenium 4
- Cucumber
- Cluecumber Report
- Cross platform
- Multiple Browser (chrome e firefox nessa demo)
- Page Objects Pattern (Fluent Page Objects)



## Notes

Nessa demo, o uso de explicit wait não foi necessário
## Executando os testes

### IntelliJ
Os testes podem ser facilmente executados pelo Intellij diratemente pela feature. 

A feature está localizada no path: ```com/agi/automation/automation.feature``` no package test


### Maven

Parta executar todos os testes, execute o comando:

```bash
  mvn test
```

Pra executar um grupo específico de testes (as tags e2e e smoke foram usadas nessa demo):

```bash
  mvn test -Dgroups=e2e 
```

Para executar os testes e gerar o relatório com cluecumber: 

```bash
  mvn test cluecumber:reporting  
```
O relatório pode ser encontrado na pasta target/generated-report
