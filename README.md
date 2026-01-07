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


# Android Studio 版本
Android Studio Dolphin | 2021.3.1
Build #AI-213.7172.25.2113.9014738, built on September 1, 2022
Runtime version: 11.0.13+0-b1751.21-8125866 amd64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
Windows 11 10.0
GC: G1 Young Generation, G1 Old Generation
Memory: 1280M
Cores: 12
Registry:
external.system.auto.import.disabled=true
ide.text.editor.with.preview.show.floating.toolbar=false
clang.parameter.info=true

