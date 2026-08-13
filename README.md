# Compiladores — AFD, Máquinas de Estados e Autômatos

Projeto desenvolvido para estudar conceitos fundamentais da disciplina de **Compiladores**, com foco em **máquinas de estados**, **autômatos finitos**, **Autômatos Finitos Determinísticos (AFD)** e **análise léxica**.

## 📚 Conteúdos

- Máquinas de estados
- Autômatos finitos
- AFD — Autômato Finito Determinístico
- AFN — Autômato Finito Não Determinístico
- Estados e estados finais
- Alfabeto e símbolos
- Função de transição
- Regras de transição
- Reconhecimento de palavras
- Expressões regulares
- Análise léxica
- Leitura de arquivos em Java

---

## 🤖 Máquinas de Estados

Uma **máquina de estados** é um modelo utilizado para representar sistemas que possuem diferentes estados e mudam de estado de acordo com entradas ou eventos.

Uma máquina de estados possui:

- Um conjunto de estados;
- Um estado inicial;
- Um conjunto de estados finais;
- Um conjunto de entradas;
- Regras de transição.

Exemplo:

```text
       0
  ┌─────────┐
  │         ▼
 (q0) ────> (q1)
  │          │
  │ 1        │ 0
  ▼          ▼
 (q2) <──── (q3)
       1
