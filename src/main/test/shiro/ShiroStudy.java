package shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

/**
 * shiro学习
 */
public class ShiroStudy {
    public static void main(String args[]) {
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro/shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
//        System.exit(0);

        Subject currentUser = SecurityUtils.getSubject();
        Session session = currentUser.getSession();

        if (!currentUser.isAuthenticated()) {   //是否登录
            UsernamePasswordToken token = new UsernamePasswordToken("lonestarr", "vespa");
            token.setRememberMe(true);
            currentUser.login(token);
        }

        System.out.println(currentUser.getPrincipal()); //当前用户名

        if (currentUser.hasRole("goodguy")) {
            System.out.println("有goodguy角色");
        }else{
            System.out.println("没有goodguy角色");
        }
    }

}
