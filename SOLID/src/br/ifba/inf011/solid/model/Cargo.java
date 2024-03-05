package br.ifba.inf011.solid.model;

public enum Cargo {
	JUNIOR{
		@Override
		public Cargo next() {
			return Cargo.PLENO;
		};
	},
	PLENO {
		@Override
		public Cargo next() {
			return Cargo.SENIOR;		}
	},
	SENIOR {
		@Override
		public Cargo next() {
			return Cargo.MENTOR;
		}
	},
	MENTOR{
		@Override
		public Cargo next() {
			return Cargo.MENTOR;
		}
	};

	public abstract Cargo next();
}
