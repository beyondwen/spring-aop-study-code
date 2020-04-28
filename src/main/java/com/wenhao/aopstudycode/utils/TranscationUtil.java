package com.wenhao.aopstudycode.utils;

import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.annotation.Resource;

@Component
public class TranscationUtil {

    @Resource
    private JpaTransactionManager transactionManager;

    public TransactionStatus begin() {
        System.out.println("获取当前事务》》》》");
        return transactionManager.getTransaction(new DefaultTransactionDefinition());
    }

    public void commit(TransactionStatus transaction) {
        System.out.println("提交当前事务》》》》");
        transactionManager.commit(transaction);
    }

    public void rollBack(TransactionStatus transaction) {
        System.out.println("回滚当前事务》》》》");
        transactionManager.rollback(transaction);
    }
}
