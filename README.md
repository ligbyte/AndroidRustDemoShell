# AndroidRustDemo
Android Studio 使用 Rust

cargo install cargo-ndk

cargo ndk -t armeabi-v7a -t arm64-v8a -o ../src/main/jniLibs build  --release


rustup target add armv7-linux-androideabi   # for arm
rustup target add aarch64-linux-android     # for arm64
rustup target add i686-linux-android        # for x86
rustup target add x86_64-linux-android      # for x86_64

rustup target add x86_64-unknown-linux-gnu  # for linux-x86-64
rustup target add x86_64-apple-darwin       # for darwin x86_64 (if you have an Intel MacOS)
rustup target add aarch64-apple-darwin      # for darwin arm64 (if you have a M1 MacOS)
rustup target add x86_64-pc-windows-gnu     # for win32-x86-64-gnu
rustup target add x86_64-pc-windows-msvc    # for win32-x86-64-msvc
...