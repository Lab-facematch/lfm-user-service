# Serviço para salvar dados de usuário

## Requisitos
Deve ter uma entidade de usuário com os seguintes campos:
- Id
- Nome
- Foto
- Documento
- Score de similiaridade
- status

Deve ter um controller com as seguintes rotas:
- POST /user
  - Deve receber um json com o campo nome
- GET /user/:id
  - Deve retornar um json com os dados do usuário
- GET /user
  - Deve retornar um json contendo uma lista com os dados do usuário
- POST /user/:id/photo
  - Deve receber um arquivo de imagem e salvar no s3 /photos
  - Deve retornar um json com o caminho da imagem
- POST /user/:id/document
  - Deve receber um arquivo de imagem e salvar no s3 /documents
  - Deve retornar um json com o caminho da imagem
