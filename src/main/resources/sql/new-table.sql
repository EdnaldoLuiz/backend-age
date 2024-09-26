-- Active: 1706276672210@@127.0.0.1@3306@agebd
DROP IF EXISTS TABLE TBMOVFAT;

CREATE TABLE TBMOVFAT (
    id INT AUTO_INCREMENT PRIMARY KEY,
    mes_ano VARCHAR(6) NOT NULL,
    contrato VARCHAR(50),
    razao_social VARCHAR(255),
    cliente VARCHAR(255),
    tipo VARCHAR(50),
    empresa VARCHAR(255),
    banco VARCHAR(50),
    vencimento DATE,
    mensalidade DECIMAL(10, 2),
    decimo_terceiro DECIMAL(10, 2),
    extra DECIMAL(10, 2),
    retencao DECIMAL(10, 2),
    total DECIMAL(10, 2),
    nf VARCHAR(20),
    num_nf VARCHAR(20),
    num_tit VARCHAR(20),
    dtpg DATE,
    vlpg DECIMAL(10, 2),
    status VARCHAR(50),
    observacao TEXT,
    comissao DECIMAL(10, 2),
    valor_comissao DECIMAL(10, 2),
    dia_pg INT,
    ano_mes_pag VARCHAR(6),
    comp_imposto VARCHAR(50)
);

select * from TBMOVFAT;


INSERT INTO TBMOVFAT (mes_ano, contrato, razao_social, cliente, tipo, empresa, banco, vencimento, mensalidade, decimo_terceiro, extra, retencao, total, nf, num_nf, num_tit, dtpg, vlpg, status, observacao, comissao, valor_comissao, dia_pg, ano_mes_pag, comp_imposto)
VALUES 
('202401', 'CT001', 'Empresa A Ltda', 'Cliente 1', 'Serviço', 'Empresa A', 'Banco X', '2024-01-10', 1500.00, 125.00, 200.00, 50.00, 1775.00, 'NF001', '1001', 'TIT001', '2024-01-15', 1700.00, 'Pago', 'Pagamento realizado via transferência', 10.00, 170.00, 15, '202401', 'Imposto A'),
('202402', 'CT002', 'Empresa B Ltda', 'Cliente 2', 'Produto', 'Empresa B', 'Banco Y', '2024-02-20', 2000.00, 166.67, 250.00, 75.00, 2341.67, 'NF002', '1002', 'TIT002', '2024-02-25', 2200.00, 'Pago', 'Pagamento realizado via boleto', 5.00, 110.00, 25, '202402', 'Imposto B'),
('202403', 'CT003', 'Empresa C Ltda', 'Cliente 3', 'Serviço', 'Empresa C', 'Banco Z', '2024-03-15', 3000.00, 250.00, 300.00, 100.00, 3450.00, 'NF003', '1003', 'TIT003', '2024-03-18', 3300.00, 'Pago', 'Pagamento realizado via cheque', 8.00, 264.00, 18, '202403', 'Imposto C'),
('202404', 'CT004', 'Empresa D Ltda', 'Cliente 4', 'Produto', 'Empresa D', 'Banco W', '2024-04-10', 2500.00, 208.33, 150.00, 50.00, 2908.33, 'NF004', '1004', 'TIT004', '2024-04-12', 2800.00, 'Pago', 'Pagamento realizado via cartão de crédito', 7.00, 196.00, 12, '202404', 'Imposto D'),
('202405', 'CT005', 'Empresa E Ltda', 'Cliente 5', 'Serviço', 'Empresa E', 'Banco V', '2024-05-25', 3500.00, 291.67, 100.00, 125.00, 3916.67, 'NF005', '1005', 'TIT005', '2024-05-28', 3800.00, 'Pago', 'Pagamento realizado via transferência', 9.00, 315.00, 28, '202405', 'Imposto E'),
('202406', 'CT006', 'Empresa F Ltda', 'Cliente 6', 'Produto', 'Empresa F', 'Banco U', '2024-06-05', 4000.00, 333.33, 500.00, 150.00, 4683.33, 'NF006', '1006', 'TIT006', '2024-06-08', 4500.00, 'Pago', 'Pagamento realizado via PIX', 6.00, 270.00, 8, '202406', 'Imposto F'),
('202407', 'CT007', 'Empresa G Ltda', 'Cliente 7', 'Serviço', 'Empresa G', 'Banco T', '2024-07-15', 4500.00, 375.00, 350.00, 175.00, 5250.00, 'NF007', '1007', 'TIT007', '2024-07-18', 5100.00, 'Pago', 'Pagamento realizado via TED', 11.00, 495.00, 18, '202407', 'Imposto G'),
('202408', 'CT008', 'Empresa H Ltda', 'Cliente 8', 'Produto', 'Empresa H', 'Banco S', '2024-08-10', 5000.00, 416.67, 400.00, 200.00, 5816.67, 'NF008', '1008', 'TIT008', '2024-08-12', 5700.00, 'Pago', 'Pagamento realizado via boleto', 12.00, 684.00, 12, '202408', 'Imposto H'),
('202409', 'CT009', 'Empresa I Ltda', 'Cliente 9', 'Serviço', 'Empresa I', 'Banco R', '2024-09-20', 5500.00, 458.33, 600.00, 225.00, 6783.33, 'NF009', '1009', 'TIT009', '2024-09-22', 6400.00, 'Pago', 'Pagamento realizado via cartão de débito', 10.00, 670.00, 22, '202409', 'Imposto I'),
('202410', 'CT010', 'Empresa J Ltda', 'Cliente 10', 'Produto', 'Empresa J', 'Banco Q', '2024-10-05', 6000.00, 500.00, 450.00, 250.00, 7200.00, 'NF010', '1010', 'TIT010', '2024-10-07', 6900.00, 'Pago', 'Pagamento realizado via transferência', 15.00, 975.00, 7, '202410', 'Imposto J');

INSERT INTO TBMOVFAT (mes_ano, contrato, razao_social, cliente, tipo, empresa, banco, vencimento, mensalidade, decimo_terceiro, extra, retencao, total, nf, num_nf, num_tit, dtpg, vlpg, status, observacao, comissao, valor_comissao, dia_pg, ano_mes_pag, comp_imposto)
VALUES 
('202411', 'CT011', 'Empresa K Ltda', 'Cliente 11', 'Serviço', 'Empresa K', 'Banco P', '2024-11-15', 6500.00, 541.67, 500.00, 300.00, 7741.67, 'NF011', '1011', 'TIT011', '2024-11-17', 7600.00, 'Pago', 'Pagamento realizado via PIX', 12.00, 912.00, 17, '202411', 'Imposto K'),
('202412', 'CT012', 'Empresa L Ltda', 'Cliente 12', 'Produto', 'Empresa L', 'Banco O', '2024-12-20', 7000.00, 583.33, 400.00, 350.00, 8333.33, 'NF012', '1012', 'TIT012', '2024-12-22', 8200.00, 'Pago', 'Pagamento realizado via transferência', 13.00, 1066.00, 22, '202412', 'Imposto L'),
('202501', 'CT013', 'Empresa M Ltda', 'Cliente 13', 'Serviço', 'Empresa M', 'Banco N', '2025-01-10', 5500.00, 458.33, 250.00, 200.00, 6408.33, 'NF013', '1013', 'TIT013', '2025-01-12', 6300.00, 'Pago', 'Pagamento realizado via cartão de crédito', 9.00, 567.00, 12, '202501', 'Imposto M'),
('202502', 'CT014', 'Empresa N Ltda', 'Cliente 14', 'Produto', 'Empresa N', 'Banco M', '2025-02-25', 8000.00, 666.67, 600.00, 400.00, 9666.67, 'NF014', '1014', 'TIT014', '2025-02-28', 9400.00, 'Pago', 'Pagamento realizado via cheque', 10.00, 700.00, 28, '202502', 'Imposto N'),
('202503', 'CT015', 'Empresa O Ltda', 'Cliente 15', 'Serviço', 'Empresa O', 'Banco L', '2025-03-05', 4500.00, 375.00, 300.00, 100.00, 5275.00, 'NF015', '1015', 'TIT015', '2025-03-07', 5100.00, 'Pago', 'Pagamento realizado via TED', 8.00, 408.00, 7, '202503', 'Imposto O'),
('202504', 'CT016', 'Empresa P Ltda', 'Cliente 16', 'Produto', 'Empresa P', 'Banco K', '2025-04-15', 7500.00, 625.00, 700.00, 450.00, 9275.00, 'NF016', '1016', 'TIT016', '2025-04-18', 9100.00, 'Pago', 'Pagamento realizado via boleto', 11.00, 825.00, 18, '202504', 'Imposto P'),
('202505', 'CT017', 'Empresa Q Ltda', 'Cliente 17', 'Serviço', 'Empresa Q', 'Banco J', '2025-05-20', 8500.00, 708.33, 800.00, 500.00, 10508.33, 'NF017', '1017', 'TIT017', '2025-05-23', 10300.00, 'Pago', 'Pagamento realizado via transferência', 14.00, 1190.00, 23, '202505', 'Imposto Q'),
('202506', 'CT018', 'Empresa R Ltda', 'Cliente 18', 'Produto', 'Empresa R', 'Banco I', '2025-06-30', 9000.00, 750.00, 900.00, 550.00, 11200.00, 'NF018', '1018', 'TIT018', '2025-07-02', 11000.00, 'Pago', 'Pagamento realizado via cartão de débito', 15.00, 1350.00, 2, '202506', 'Imposto R'),
('202507', 'CT019', 'Empresa S Ltda', 'Cliente 19', 'Serviço', 'Empresa S', 'Banco H', '2025-07-10', 3000.00, 250.00, 350.00, 100.00, 3700.00, 'NF019', '1019', 'TIT019', '2025-07-13', 3600.00, 'Pago', 'Pagamento realizado via cheque', 5.00, 185.00, 13, '202507', 'Imposto S'),
('202508', 'CT020', 'Empresa T Ltda', 'Cliente 20', 'Produto', 'Empresa T', 'Banco G', '2025-08-05', 4000.00, 333.33, 450.00, 200.00, 4983.33, 'NF020', '1020', 'TIT020', '2025-08-08', 4800.00, 'Pago', 'Pagamento realizado via transferência', 7.00, 336.00, 8, '202508', 'Imposto T');
