package org.goots;

import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.supplier.RepositorySystemSupplier;

public class Main
{
    public static void main( String[] args )
    {
        new Main().call();
    }

    public void call () {
        System.out.println( "Hello world!" );
        RepositorySystem system = new RepositorySystemSupplier().get();
//        DefaultRepositorySystemSession session = MavenRepositorySystemUtils.newSession();
    }
}